package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymTypeRO_0000056Iterator theSynonymTypeRO_0000056Iterator = (SynonymTypeRO_0000056Iterator)findAncestorWithClass(this, SynonymTypeRO_0000056Iterator.class);
			pageContext.getOut().print(theSynonymTypeRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

