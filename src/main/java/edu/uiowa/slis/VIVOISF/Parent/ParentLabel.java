package edu.uiowa.slis.VIVOISF.Parent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ParentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ParentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ParentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Parent theParent = (Parent)findAncestorWithClass(this, Parent.class);
			if (!theParent.commitNeeded) {
				pageContext.getOut().print(theParent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Parent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Parent for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Parent theParent = (Parent)findAncestorWithClass(this, Parent.class);
			return theParent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Parent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Parent for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Parent theParent = (Parent)findAncestorWithClass(this, Parent.class);
			theParent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Parent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Parent for label tag ");
		}
	}
}

