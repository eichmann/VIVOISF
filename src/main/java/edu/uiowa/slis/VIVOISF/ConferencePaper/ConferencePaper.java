package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ConferencePaper extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaper currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaper.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConferencePaperIterator theConferencePaperIterator = (ConferencePaperIterator) findAncestorWithClass(this, ConferencePaperIterator.class);

			if (theConferencePaperIterator != null) {
				subjectURI = theConferencePaperIterator.getSubjectURI();
				label = theConferencePaperIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator)this.getParent()).getDateTimeValueInverse();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator theBFO_0000001RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0002234Iterator != null) {
				subjectURI = theBFO_0000001RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator theBFO_0000003RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000003RO_0002234Iterator != null) {
				subjectURI = theBFO_0000003RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator theBFO_0000015RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000015RO_0002234Iterator != null) {
				subjectURI = theBFO_0000015RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator theEventRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator.class);

			if (subjectURI == null && theEventRO_0002234Iterator != null) {
				subjectURI = theEventRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator theConferenceRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator.class);

			if (subjectURI == null && theConferenceRO_0002234Iterator != null) {
				subjectURI = theConferenceRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator theThingRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator.class);

			if (subjectURI == null && theThingRO_0002234Iterator != null) {
				subjectURI = theThingRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator theBFO_0000001RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000001RelatedByIterator != null) {
				subjectURI = theBFO_0000001RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator theBFO_0000002RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000002RelatedByIterator != null) {
				subjectURI = theBFO_0000002RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator theThingRelatedByIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator.class);

			if (subjectURI == null && theThingRelatedByIterator != null) {
				subjectURI = theThingRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator theBFO_0000017RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000017RelatedByIterator != null) {
				subjectURI = theBFO_0000017RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator theBFO_0000020RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000020RelatedByIterator != null) {
				subjectURI = theBFO_0000020RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator theBFO_0000023RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000023RelatedByIterator != null) {
				subjectURI = theBFO_0000023RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator theBFO_0000001PublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator.class);

			if (subjectURI == null && theBFO_0000001PublicationVenueForIterator != null) {
				subjectURI = theBFO_0000001PublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator theBFO_0000002PublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator.class);

			if (subjectURI == null && theBFO_0000002PublicationVenueForIterator != null) {
				subjectURI = theBFO_0000002PublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator theBFO_0000031PublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator.class);

			if (subjectURI == null && theBFO_0000031PublicationVenueForIterator != null) {
				subjectURI = theBFO_0000031PublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator theIAO_0000030PublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator.class);

			if (subjectURI == null && theIAO_0000030PublicationVenueForIterator != null) {
				subjectURI = theIAO_0000030PublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator theThingPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator.class);

			if (subjectURI == null && theThingPublicationVenueForIterator != null) {
				subjectURI = theThingPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator theCollectionPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator.class);

			if (subjectURI == null && theCollectionPublicationVenueForIterator != null) {
				subjectURI = theCollectionPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator theJournalPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator.class);

			if (subjectURI == null && theJournalPublicationVenueForIterator != null) {
				subjectURI = theJournalPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator thePeriodicalPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator.class);

			if (subjectURI == null && thePeriodicalPublicationVenueForIterator != null) {
				subjectURI = thePeriodicalPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator theBFO_0000001RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator.class);

			if (subjectURI == null && theBFO_0000001RelatesIterator != null) {
				subjectURI = theBFO_0000001RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator theBFO_0000002RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator.class);

			if (subjectURI == null && theBFO_0000002RelatesIterator != null) {
				subjectURI = theBFO_0000002RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator theThingRelatesIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator.class);

			if (subjectURI == null && theThingRelatesIterator != null) {
				subjectURI = theThingRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator theBFO_0000020RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator.class);

			if (subjectURI == null && theBFO_0000020RelatesIterator != null) {
				subjectURI = theBFO_0000020RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator theRelationshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator.class);

			if (subjectURI == null && theRelationshipRelatesIterator != null) {
				subjectURI = theRelationshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator theAuthorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator.class);

			if (subjectURI == null && theAuthorshipRelatesIterator != null) {
				subjectURI = theAuthorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator theBFO_0000031RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator.class);

			if (subjectURI == null && theBFO_0000031RelatesIterator != null) {
				subjectURI = theBFO_0000031RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator theIAO_0000030RelatesIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator.class);

			if (subjectURI == null && theIAO_0000030RelatesIterator != null) {
				subjectURI = theIAO_0000030RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator theARG_2000379RelatesIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator.class);

			if (subjectURI == null && theARG_2000379RelatesIterator != null) {
				subjectURI = theARG_2000379RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator theKindRelatesIterator = (edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator.class);

			if (subjectURI == null && theKindRelatesIterator != null) {
				subjectURI = theKindRelatesIterator.getRelates();
			}

			if (theConferencePaperIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ConferencePaper doStartTag", e);
			throw new JspTagException("Exception raised in ConferencePaper doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ConferencePaper doEndTag", e);
			throw new JspTagException("Exception raised in ConferencePaper doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

}
