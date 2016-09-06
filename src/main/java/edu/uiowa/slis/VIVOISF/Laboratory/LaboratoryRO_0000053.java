package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryRO_0000053Iterator theLaboratoryRO_0000053Iterator = (LaboratoryRO_0000053Iterator)findAncestorWithClass(this, LaboratoryRO_0000053Iterator.class);
			pageContext.getOut().print(theLaboratoryRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

