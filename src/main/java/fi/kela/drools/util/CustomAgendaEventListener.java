package fi.kela.drools.util;

import org.drools.core.event.ActivationCancelledEvent;
import org.drools.core.event.ActivationCreatedEvent;
import org.drools.core.event.AfterActivationFiredEvent;
import org.drools.core.event.BeforeActivationFiredEvent;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomAgendaEventListener implements AgendaEventListener {

	private static final Logger logger = LoggerFactory.getLogger(CustomAgendaEventListener.class);
	private boolean logActivations = false;
	private boolean logAgendaGroups = false;
	private boolean logMatches = true;
	private boolean logMatchFired = false;
	private boolean logRuleFlowGroups = false;

	public void activationCancelled(ActivationCancelledEvent event) {
		if(logActivations)
			logger.info("Activation cancelled: " + event.getActivation());
	}

	public void activationCreated(ActivationCreatedEvent event) {
		if(logActivations)
			logger.info("Activation created: " + event.getActivation());
	}

	public void beforeActivationFired(BeforeActivationFiredEvent event) {
		if(logActivations)
			logger.info("Before activation fired: " + event.getActivation());
	}

	public void afterActivationFired(AfterActivationFiredEvent event) {
		if(logActivations)
			logger.info("After activation fired: " + event.getActivation());
	}

	public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
		if(logAgendaGroups)
			logger.info("Agenda group popped: " + event.getAgendaGroup());
	}

	public void agendaGroupPushed(AgendaGroupPushedEvent event) {
		if(logAgendaGroups)
			logger.info("Agenda group pushed: " + event.getAgendaGroup());
	}

	public void matchCreated(MatchCreatedEvent event) {
		if(logMatches)
			logger.info("Match created: " + event.getMatch().getRule().getName());
	}

	public void matchCancelled(MatchCancelledEvent event) {
		if(logMatches)
			logger.info("Match canceled: " + event.getMatch().getRule().getName());
	}

	public void beforeMatchFired(BeforeMatchFiredEvent event) {
		if(logMatchFired)
			logger.info("Before match fired: " + event.getMatch().getRule().getName());
	}

	public void afterMatchFired(AfterMatchFiredEvent event) {
		if(logMatchFired)
			logger.info("After match fired: " + event.getMatch().getRule().getName());
	}

	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
		if(logRuleFlowGroups)
			logger.info("Before rule flow group activated: " + event.getRuleFlowGroup());
	}

	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
		if(logRuleFlowGroups)
			logger.info("After rule flow group activated: " + event.getRuleFlowGroup());
	}

	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
		if(logRuleFlowGroups)
			logger.info("Before rule flow group deactivated: " + event.getRuleFlowGroup());
	}

	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
		if(logRuleFlowGroups)
			logger.info("After rule flow group deactivated: " + event.getRuleFlowGroup());
	}
}
