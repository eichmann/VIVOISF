package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasTelephoneIterator theConferencePosterHasTelephoneIterator = (ConferencePosterHasTelephoneIterator)findAncestorWithClass(this, ConferencePosterHasTelephoneIterator.class);
			pageContext.getOut().print(theConferencePosterHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

