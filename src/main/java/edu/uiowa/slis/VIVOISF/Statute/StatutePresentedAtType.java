package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatutePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatutePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatutePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatutePresentedAtIterator theStatutePresentedAtIterator = (StatutePresentedAtIterator)findAncestorWithClass(this, StatutePresentedAtIterator.class);
			pageContext.getOut().print(theStatutePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

