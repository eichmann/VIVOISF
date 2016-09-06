package edu.uiowa.slis.VIVOISF.Category;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CategoryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CategoryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CategoryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Category theCategory = (Category)findAncestorWithClass(this, Category.class);
			if (!theCategory.commitNeeded) {
				pageContext.getOut().print(theCategory.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Category for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Category theCategory = (Category)findAncestorWithClass(this, Category.class);
			return theCategory.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Category for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Category theCategory = (Category)findAncestorWithClass(this, Category.class);
			theCategory.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Category for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for label tag ");
		}
	}
}

