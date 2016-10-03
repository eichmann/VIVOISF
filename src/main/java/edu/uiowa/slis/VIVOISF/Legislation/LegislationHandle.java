package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationHandleIterator theLegislation = (LegislationHandleIterator)findAncestorWithClass(this, LegislationHandleIterator.class);
			pageContext.getOut().print(theLegislation.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for handle tag ");
		}
		return SKIP_BODY;
	}
}

