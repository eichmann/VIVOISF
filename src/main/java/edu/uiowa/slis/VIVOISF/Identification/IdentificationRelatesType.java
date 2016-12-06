package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IdentificationRelatesIterator theIdentificationRelatesIterator = (IdentificationRelatesIterator)findAncestorWithClass(this, IdentificationRelatesIterator.class);
			pageContext.getOut().print(theIdentificationRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for relates tag ");
		}
		return SKIP_BODY;
	}
}

