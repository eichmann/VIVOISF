package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterPerformerInverseIterator theCenterPerformerInverseIterator = (CenterPerformerInverseIterator)findAncestorWithClass(this, CenterPerformerInverseIterator.class);
			pageContext.getOut().print(theCenterPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for performer tag ");
		}
		return SKIP_BODY;
	}
}

