package edu.uiowa.slis.VIVOISF.Category;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CategorySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CategorySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CategorySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Category theCategory = (Category)findAncestorWithClass(this, Category.class);
			if (!theCategory.commitNeeded) {
				pageContext.getOut().print(theCategory.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Category for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Category theCategory = (Category)findAncestorWithClass(this, Category.class);
			return theCategory.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Category for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Category theCategory = (Category)findAncestorWithClass(this, Category.class);
			theCategory.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Category for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for subjectURI tag ");
		}
	}
}

