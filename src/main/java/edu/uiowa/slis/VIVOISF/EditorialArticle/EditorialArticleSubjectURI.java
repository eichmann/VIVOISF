package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticle theEditorialArticle = (EditorialArticle)findAncestorWithClass(this, EditorialArticle.class);
			if (!theEditorialArticle.commitNeeded) {
				pageContext.getOut().print(theEditorialArticle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EditorialArticle theEditorialArticle = (EditorialArticle)findAncestorWithClass(this, EditorialArticle.class);
			return theEditorialArticle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EditorialArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EditorialArticle theEditorialArticle = (EditorialArticle)findAncestorWithClass(this, EditorialArticle.class);
			theEditorialArticle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for subjectURI tag ");
		}
	}
}

