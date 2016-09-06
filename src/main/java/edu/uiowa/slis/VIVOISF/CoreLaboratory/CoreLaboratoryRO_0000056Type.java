package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryRO_0000056Iterator theCoreLaboratoryRO_0000056Iterator = (CoreLaboratoryRO_0000056Iterator)findAncestorWithClass(this, CoreLaboratoryRO_0000056Iterator.class);
			pageContext.getOut().print(theCoreLaboratoryRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

