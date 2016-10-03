package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Organization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Organization currentInstance = null;
	private static final Log log = LogFactory.getLog(Organization.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;
	String overview = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OrganizationIterator theOrganizationIterator = (OrganizationIterator) findAncestorWithClass(this, OrganizationIterator.class);

			if (theOrganizationIterator != null) {
				subjectURI = theOrganizationIterator.getSubjectURI();
				label = theOrganizationIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000070Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000070Iterator)this.getParent()).getERO_0000070();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000070Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000070Iterator)this.getParent()).getERO_0000070();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000070Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000070Iterator)this.getParent()).getERO_0000070();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000040.BFO_0000040OBI_0000304Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000040.BFO_0000040OBI_0000304Iterator)this.getParent()).getOBI_0000304();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Equipment.EquipmentEquipmentForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Equipment.EquipmentEquipmentForIterator)this.getParent()).getEquipmentFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator)this.getParent()).getERO_0000390();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.LegalDocument.LegalDocumentCourtIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.LegalDocument.LegalDocumentCourtIterator)this.getParent()).getCourt();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Organization.OrganizationHasSuccessorOrganizationIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Organization.OrganizationHasSuccessorOrganizationIterator)this.getParent()).getHasSuccessorOrganization();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Grant.GrantGrantSubcontractedThroughIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Grant.GrantGrantSubcontractedThroughIterator)this.getParent()).getGrantSubcontractedThrough();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Organization.OrganizationHasPredecessorOrganizationIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Organization.OrganizationHasPredecessorOrganizationIterator)this.getParent()).getHasPredecessorOrganization();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000015.ERO_0000015ERO_0001521Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000015.ERO_0000015ERO_0001521Iterator)this.getParent()).getERO_0001521();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Award.AwardSponsoredByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Award.AwardSponsoredByIterator)this.getParent()).getSponsoredBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Organization.OrganizationAffiliatedOrganizationIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Organization.OrganizationAffiliatedOrganizationIterator)this.getParent()).getAffiliatedOrganization();
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

			edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000070Iterator theERO_0000071ERO_0000070Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000070Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000071.ERO_0000071ERO_0000070Iterator.class);

			if (subjectURI == null && theERO_0000071ERO_0000070Iterator != null) {
				subjectURI = theERO_0000071ERO_0000070Iterator.getERO_0000070();
			}

			edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000070Iterator theERO_0001716ERO_0000070Iterator = (edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000070Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0001716.ERO_0001716ERO_0000070Iterator.class);

			if (subjectURI == null && theERO_0001716ERO_0000070Iterator != null) {
				subjectURI = theERO_0001716ERO_0000070Iterator.getERO_0000070();
			}

			edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000070Iterator theOBI_0000272ERO_0000070Iterator = (edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000070Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.OBI_0000272.OBI_0000272ERO_0000070Iterator.class);

			if (subjectURI == null && theOBI_0000272ERO_0000070Iterator != null) {
				subjectURI = theOBI_0000272ERO_0000070Iterator.getERO_0000070();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator theBookPublisherIterator = (edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator.class);

			if (subjectURI == null && theBookPublisherIterator != null) {
				subjectURI = theBookPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator theJournalPublisherIterator = (edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator.class);

			if (subjectURI == null && theJournalPublisherIterator != null) {
				subjectURI = theJournalPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator theChapterPublisherIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator.class);

			if (subjectURI == null && theChapterPublisherIterator != null) {
				subjectURI = theChapterPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000040.BFO_0000040OBI_0000304Iterator theBFO_0000040OBI_0000304Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000040.BFO_0000040OBI_0000304Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000040.BFO_0000040OBI_0000304Iterator.class);

			if (subjectURI == null && theBFO_0000040OBI_0000304Iterator != null) {
				subjectURI = theBFO_0000040OBI_0000304Iterator.getOBI_0000304();
			}

			edu.uiowa.slis.VIVOISF.Equipment.EquipmentEquipmentForIterator theEquipmentEquipmentForIterator = (edu.uiowa.slis.VIVOISF.Equipment.EquipmentEquipmentForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Equipment.EquipmentEquipmentForIterator.class);

			if (subjectURI == null && theEquipmentEquipmentForIterator != null) {
				subjectURI = theEquipmentEquipmentForIterator.getEquipmentFor();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator theERO_0000005ERO_0000390Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator.class);

			if (subjectURI == null && theERO_0000005ERO_0000390Iterator != null) {
				subjectURI = theERO_0000005ERO_0000390Iterator.getERO_0000390();
			}

			edu.uiowa.slis.VIVOISF.LegalDocument.LegalDocumentCourtIterator theLegalDocumentCourtIterator = (edu.uiowa.slis.VIVOISF.LegalDocument.LegalDocumentCourtIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.LegalDocument.LegalDocumentCourtIterator.class);

			if (subjectURI == null && theLegalDocumentCourtIterator != null) {
				subjectURI = theLegalDocumentCourtIterator.getCourt();
			}

			edu.uiowa.slis.VIVOISF.Organization.OrganizationHasSuccessorOrganizationIterator theOrganizationHasSuccessorOrganizationIterator = (edu.uiowa.slis.VIVOISF.Organization.OrganizationHasSuccessorOrganizationIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Organization.OrganizationHasSuccessorOrganizationIterator.class);

			if (subjectURI == null && theOrganizationHasSuccessorOrganizationIterator != null) {
				subjectURI = theOrganizationHasSuccessorOrganizationIterator.getHasSuccessorOrganization();
			}

			edu.uiowa.slis.VIVOISF.Grant.GrantGrantSubcontractedThroughIterator theGrantGrantSubcontractedThroughIterator = (edu.uiowa.slis.VIVOISF.Grant.GrantGrantSubcontractedThroughIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Grant.GrantGrantSubcontractedThroughIterator.class);

			if (subjectURI == null && theGrantGrantSubcontractedThroughIterator != null) {
				subjectURI = theGrantGrantSubcontractedThroughIterator.getGrantSubcontractedThrough();
			}

			edu.uiowa.slis.VIVOISF.Organization.OrganizationHasPredecessorOrganizationIterator theOrganizationHasPredecessorOrganizationIterator = (edu.uiowa.slis.VIVOISF.Organization.OrganizationHasPredecessorOrganizationIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Organization.OrganizationHasPredecessorOrganizationIterator.class);

			if (subjectURI == null && theOrganizationHasPredecessorOrganizationIterator != null) {
				subjectURI = theOrganizationHasPredecessorOrganizationIterator.getHasPredecessorOrganization();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000015.ERO_0000015ERO_0001521Iterator theERO_0000015ERO_0001521Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000015.ERO_0000015ERO_0001521Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000015.ERO_0000015ERO_0001521Iterator.class);

			if (subjectURI == null && theERO_0000015ERO_0001521Iterator != null) {
				subjectURI = theERO_0000015ERO_0001521Iterator.getERO_0001521();
			}

			edu.uiowa.slis.VIVOISF.Award.AwardSponsoredByIterator theAwardSponsoredByIterator = (edu.uiowa.slis.VIVOISF.Award.AwardSponsoredByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Award.AwardSponsoredByIterator.class);

			if (subjectURI == null && theAwardSponsoredByIterator != null) {
				subjectURI = theAwardSponsoredByIterator.getSponsoredBy();
			}

			edu.uiowa.slis.VIVOISF.Organization.OrganizationAffiliatedOrganizationIterator theOrganizationAffiliatedOrganizationIterator = (edu.uiowa.slis.VIVOISF.Organization.OrganizationAffiliatedOrganizationIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Organization.OrganizationAffiliatedOrganizationIterator.class);

			if (subjectURI == null && theOrganizationAffiliatedOrganizationIterator != null) {
				subjectURI = theOrganizationAffiliatedOrganizationIterator.getAffiliatedOrganization();
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

			if (theOrganizationIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?abbreviation ?overview where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?abbreviation } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#overview> ?overview } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					abbreviation = sol.get("?abbreviation") == null ? null : sol.get("?abbreviation").toString();
					overview = sol.get("?overview") == null ? null : sol.get("?overview").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Organization doStartTag", e);
			throw new JspTagException("Exception raised in Organization doStartTag");
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
			log.error("Exception raised in Organization doEndTag", e);
			throw new JspTagException("Exception raised in Organization doEndTag");
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

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getOverview() {
		return overview;
	}

}
