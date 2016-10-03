package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryPerformerInverseIterator theLaboratoryPerformerInverseIterator = (LaboratoryPerformerInverseIterator)findAncestorWithClass(this, LaboratoryPerformerInverseIterator.class);
			pageContext.getOut().print(theLaboratoryPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for performer tag ");
		}
		return SKIP_BODY;
	}
}

