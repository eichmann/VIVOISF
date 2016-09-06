package edu.uiowa.slis.VIVOISF.Type;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TypeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TypeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TypeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Type theType = (Type)findAncestorWithClass(this, Type.class);
			if (!theType.commitNeeded) {
				pageContext.getOut().print(theType.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Type for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Type for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Type theType = (Type)findAncestorWithClass(this, Type.class);
			return theType.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Type for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Type for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Type theType = (Type)findAncestorWithClass(this, Type.class);
			theType.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Type for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Type for label tag ");
		}
	}
}

