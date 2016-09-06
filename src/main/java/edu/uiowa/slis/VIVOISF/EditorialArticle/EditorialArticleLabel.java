package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticle theEditorialArticle = (EditorialArticle)findAncestorWithClass(this, EditorialArticle.class);
			if (!theEditorialArticle.commitNeeded) {
				pageContext.getOut().print(theEditorialArticle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EditorialArticle theEditorialArticle = (EditorialArticle)findAncestorWithClass(this, EditorialArticle.class);
			return theEditorialArticle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EditorialArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EditorialArticle theEditorialArticle = (EditorialArticle)findAncestorWithClass(this, EditorialArticle.class);
			theEditorialArticle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for label tag ");
		}
	}
}

