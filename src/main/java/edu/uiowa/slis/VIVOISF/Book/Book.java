package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Book extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Book currentInstance = null;
	private static final Log log = LogFactory.getLog(Book.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BookIterator theBookIterator = (BookIterator) findAncestorWithClass(this, BookIterator.class);

			if (theBookIterator != null) {
				subjectURI = theBookIterator.getSubjectURI();
				label = theBookIterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator)this.getParent()).getDateTimeValueInverse();
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

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator theBFO_0000001HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000001HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000001HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator theBFO_0000002HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000002HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000002HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator theBFO_0000031HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000031HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000031HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator theIAO_0000030HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator.class);

			if (subjectURI == null && theIAO_0000030HasPublicationVenueIterator != null) {
				subjectURI = theIAO_0000030HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator theDocumentHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator.class);

			if (subjectURI == null && theDocumentHasPublicationVenueIterator != null) {
				subjectURI = theDocumentHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator theThingHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator.class);

			if (subjectURI == null && theThingHasPublicationVenueIterator != null) {
				subjectURI = theThingHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator theBookSectionHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator.class);

			if (subjectURI == null && theBookSectionHasPublicationVenueIterator != null) {
				subjectURI = theBookSectionHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator theChapterHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator.class);

			if (subjectURI == null && theChapterHasPublicationVenueIterator != null) {
				subjectURI = theChapterHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator theDocumentPartHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator.class);

			if (subjectURI == null && theDocumentPartHasPublicationVenueIterator != null) {
				subjectURI = theDocumentPartHasPublicationVenueIterator.getHasPublicationVenue();
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

			edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator theEditorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator.class);

			if (subjectURI == null && theEditorshipRelatesIterator != null) {
				subjectURI = theEditorshipRelatesIterator.getRelates();
			}

			if (theBookIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Book doStartTag", e);
			throw new JspTagException("Exception raised in Book doStartTag");
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
			log.error("Exception raised in Book doEndTag", e);
			throw new JspTagException("Exception raised in Book doEndTag");
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
