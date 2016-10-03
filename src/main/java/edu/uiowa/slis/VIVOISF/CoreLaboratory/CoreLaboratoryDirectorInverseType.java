package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryDirectorInverseIterator theCoreLaboratoryDirectorInverseIterator = (CoreLaboratoryDirectorInverseIterator)findAncestorWithClass(this, CoreLaboratoryDirectorInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for director tag ");
		}
		return SKIP_BODY;
	}
}

