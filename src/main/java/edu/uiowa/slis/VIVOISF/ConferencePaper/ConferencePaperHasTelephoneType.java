package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasTelephoneIterator theConferencePaperHasTelephoneIterator = (ConferencePaperHasTelephoneIterator)findAncestorWithClass(this, ConferencePaperHasTelephoneIterator.class);
			pageContext.getOut().print(theConferencePaperHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

