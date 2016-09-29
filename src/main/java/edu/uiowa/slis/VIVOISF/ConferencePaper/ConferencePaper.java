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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator)this.getParent()).getDateTimeValueInverse();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator theJournalPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator.class);

			if (subjectURI == null && theJournalPublicationVenueForIterator != null) {
				subjectURI = theJournalPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator theBookPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator.class);

			if (subjectURI == null && theBookPublicationVenueForIterator != null) {
				subjectURI = theBookPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator theConferenceRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator.class);

			if (subjectURI == null && theConferenceRO_0002234Iterator != null) {
				subjectURI = theConferenceRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator theIndividualRelatedByIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator.class);

			if (subjectURI == null && theIndividualRelatedByIterator != null) {
				subjectURI = theIndividualRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator theAcademicArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator.class);

			if (subjectURI == null && theAcademicArticleRelatedByIterator != null) {
				subjectURI = theAcademicArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator thePersonRelatedByIterator = (edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator.class);

			if (subjectURI == null && thePersonRelatedByIterator != null) {
				subjectURI = thePersonRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator theArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator.class);

			if (subjectURI == null && theArticleRelatedByIterator != null) {
				subjectURI = theArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator theConferencePaperRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator.class);

			if (subjectURI == null && theConferencePaperRelatedByIterator != null) {
				subjectURI = theConferencePaperRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator theDatasetRelatedByIterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator.class);

			if (subjectURI == null && theDatasetRelatedByIterator != null) {
				subjectURI = theDatasetRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator theChapterRelatedByIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator.class);

			if (subjectURI == null && theChapterRelatedByIterator != null) {
				subjectURI = theChapterRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator theConferencePosterRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator.class);

			if (subjectURI == null && theConferencePosterRelatedByIterator != null) {
				subjectURI = theConferencePosterRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator theSlideshowRelatedByIterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator.class);

			if (subjectURI == null && theSlideshowRelatedByIterator != null) {
				subjectURI = theSlideshowRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator theOrganizationRelatedByIterator = (edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator.class);

			if (subjectURI == null && theOrganizationRelatedByIterator != null) {
				subjectURI = theOrganizationRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator theReportRelatedByIterator = (edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator.class);

			if (subjectURI == null && theReportRelatedByIterator != null) {
				subjectURI = theReportRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator theBookRelatedByIterator = (edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator.class);

			if (subjectURI == null && theBookRelatedByIterator != null) {
				subjectURI = theBookRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator theCollectionRelatedByIterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator.class);

			if (subjectURI == null && theCollectionRelatedByIterator != null) {
				subjectURI = theCollectionRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator theCompanyRelatedByIterator = (edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator.class);

			if (subjectURI == null && theCompanyRelatedByIterator != null) {
				subjectURI = theCompanyRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator theNameRelatedByIterator = (edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator.class);

			if (subjectURI == null && theNameRelatedByIterator != null) {
				subjectURI = theNameRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator theAudioVisualDocumentRelatedByIterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator.class);

			if (subjectURI == null && theAudioVisualDocumentRelatedByIterator != null) {
				subjectURI = theAudioVisualDocumentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator theAuthorshipRelatedByIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator.class);

			if (subjectURI == null && theAuthorshipRelatedByIterator != null) {
				subjectURI = theAuthorshipRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator theGovernmentAgencyRelatedByIterator = (edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator.class);

			if (subjectURI == null && theGovernmentAgencyRelatedByIterator != null) {
				subjectURI = theGovernmentAgencyRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator thePublisherRelatedByIterator = (edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator.class);

			if (subjectURI == null && thePublisherRelatedByIterator != null) {
				subjectURI = thePublisherRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator theKindRelatedByIterator = (edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator.class);

			if (subjectURI == null && theKindRelatedByIterator != null) {
				subjectURI = theKindRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator theAuthorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator.class);

			if (subjectURI == null && theAuthorshipRelatesIterator != null) {
				subjectURI = theAuthorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator theAcademicArticleRelatesIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator.class);

			if (subjectURI == null && theAcademicArticleRelatesIterator != null) {
				subjectURI = theAcademicArticleRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator theDatasetRelatesIterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator.class);

			if (subjectURI == null && theDatasetRelatesIterator != null) {
				subjectURI = theDatasetRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator theArticleRelatesIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator.class);

			if (subjectURI == null && theArticleRelatesIterator != null) {
				subjectURI = theArticleRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator theChapterRelatesIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator.class);

			if (subjectURI == null && theChapterRelatesIterator != null) {
				subjectURI = theChapterRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator theNameRelatesIterator = (edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator.class);

			if (subjectURI == null && theNameRelatesIterator != null) {
				subjectURI = theNameRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator theLibrarianPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator.class);

			if (subjectURI == null && theLibrarianPositionRelatesIterator != null) {
				subjectURI = theLibrarianPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator thePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator.class);

			if (subjectURI == null && thePositionRelatesIterator != null) {
				subjectURI = thePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator theNonAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonAcademicPositionRelatesIterator != null) {
				subjectURI = theNonAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator theFacultyPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator.class);

			if (subjectURI == null && theFacultyPositionRelatesIterator != null) {
				subjectURI = theFacultyPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator theConferencePaperRelatesIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator.class);

			if (subjectURI == null && theConferencePaperRelatesIterator != null) {
				subjectURI = theConferencePaperRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator theEditorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator.class);

			if (subjectURI == null && theEditorshipRelatesIterator != null) {
				subjectURI = theEditorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator theFacultyAdministrativePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator.class);

			if (subjectURI == null && theFacultyAdministrativePositionRelatesIterator != null) {
				subjectURI = theFacultyAdministrativePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator theNonFacultyAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonFacultyAcademicPositionRelatesIterator != null) {
				subjectURI = theNonFacultyAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator theReportRelatesIterator = (edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator.class);

			if (subjectURI == null && theReportRelatesIterator != null) {
				subjectURI = theReportRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator thePrimaryPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator.class);

			if (subjectURI == null && thePrimaryPositionRelatesIterator != null) {
				subjectURI = thePrimaryPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator theKindRelatesIterator = (edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator.class);

			if (subjectURI == null && theKindRelatesIterator != null) {
				subjectURI = theKindRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator theBookRelatesIterator = (edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator.class);

			if (subjectURI == null && theBookRelatesIterator != null) {
				subjectURI = theBookRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator thePostdocPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator.class);

			if (subjectURI == null && thePostdocPositionRelatesIterator != null) {
				subjectURI = thePostdocPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator theURLRelatesIterator = (edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator.class);

			if (subjectURI == null && theURLRelatesIterator != null) {
				subjectURI = theURLRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator theConferencePosterRelatesIterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator.class);

			if (subjectURI == null && theConferencePosterRelatesIterator != null) {
				subjectURI = theConferencePosterRelatesIterator.getRelates();
			}

			if (theConferencePaperIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
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

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
