package edu.uiowa.slis.VIVOISF.ReflexiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReflexivePropertyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReflexivePropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ReflexivePropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ReflexiveProperty theReflexiveProperty = (ReflexiveProperty)findAncestorWithClass(this, ReflexiveProperty.class);
			if (!theReflexiveProperty.commitNeeded) {
				pageContext.getOut().print(theReflexiveProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ReflexiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReflexiveProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ReflexiveProperty theReflexiveProperty = (ReflexiveProperty)findAncestorWithClass(this, ReflexiveProperty.class);
			return theReflexiveProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ReflexiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReflexiveProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ReflexiveProperty theReflexiveProperty = (ReflexiveProperty)findAncestorWithClass(this, ReflexiveProperty.class);
			theReflexiveProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ReflexiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReflexiveProperty for label tag ");
		}
	}
}

