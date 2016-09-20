package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryOBI_0000304InverseIterator theCoreLaboratoryOBI_0000304InverseIterator = (CoreLaboratoryOBI_0000304InverseIterator)findAncestorWithClass(this, CoreLaboratoryOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

