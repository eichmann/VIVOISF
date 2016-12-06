package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasTelephoneIterator theConferencePaperHasTelephoneIterator = (ConferencePaperHasTelephoneIterator)findAncestorWithClass(this, ConferencePaperHasTelephoneIterator.class);
			pageContext.getOut().print(theConferencePaperHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

