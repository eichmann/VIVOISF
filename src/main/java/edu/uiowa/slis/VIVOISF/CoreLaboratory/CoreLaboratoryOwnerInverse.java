package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryOwnerInverseIterator theCoreLaboratoryOwnerInverseIterator = (CoreLaboratoryOwnerInverseIterator)findAncestorWithClass(this, CoreLaboratoryOwnerInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for owner tag ");
		}
		return SKIP_BODY;
	}
}

