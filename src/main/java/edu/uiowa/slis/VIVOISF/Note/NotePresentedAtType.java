package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NotePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotePresentedAtIterator theNotePresentedAtIterator = (NotePresentedAtIterator)findAncestorWithClass(this, NotePresentedAtIterator.class);
			pageContext.getOut().print(theNotePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

