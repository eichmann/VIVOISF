package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryERO_0000031Iterator theCoreLaboratoryERO_0000031Iterator = (CoreLaboratoryERO_0000031Iterator)findAncestorWithClass(this, CoreLaboratoryERO_0000031Iterator.class);
			pageContext.getOut().print(theCoreLaboratoryERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

