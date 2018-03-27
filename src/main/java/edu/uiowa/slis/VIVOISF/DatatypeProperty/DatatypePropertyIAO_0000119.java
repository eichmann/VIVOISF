package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyIAO_0000119 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyIAO_0000119 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyIAO_0000119.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyIAO_0000119Iterator theDatatypeProperty = (DatatypePropertyIAO_0000119Iterator)findAncestorWithClass(this, DatatypePropertyIAO_0000119Iterator.class);
			pageContext.getOut().print(theDatatypeProperty.getIAO_0000119());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for IAO_0000119 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for IAO_0000119 tag ");
		}
		return SKIP_BODY;
	}
}

