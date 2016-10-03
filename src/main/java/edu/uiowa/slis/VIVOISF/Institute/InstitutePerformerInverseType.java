package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstitutePerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstitutePerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstitutePerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstitutePerformerInverseIterator theInstitutePerformerInverseIterator = (InstitutePerformerInverseIterator)findAncestorWithClass(this, InstitutePerformerInverseIterator.class);
			pageContext.getOut().print(theInstitutePerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for performer tag ");
		}
		return SKIP_BODY;
	}
}

