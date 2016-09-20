package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryERO_0000037Iterator theCoreLaboratoryERO_0000037Iterator = (CoreLaboratoryERO_0000037Iterator)findAncestorWithClass(this, CoreLaboratoryERO_0000037Iterator.class);
			pageContext.getOut().print(theCoreLaboratoryERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

