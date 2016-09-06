package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryRO_0000056Iterator theLaboratoryRO_0000056Iterator = (LaboratoryRO_0000056Iterator)findAncestorWithClass(this, LaboratoryRO_0000056Iterator.class);
			pageContext.getOut().print(theLaboratoryRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

