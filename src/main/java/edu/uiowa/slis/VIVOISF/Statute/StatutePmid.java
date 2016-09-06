package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatutePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatutePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(StatutePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatutePmidIterator theStatute = (StatutePmidIterator)findAncestorWithClass(this, StatutePmidIterator.class);
			pageContext.getOut().print(theStatute.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for pmid tag ");
		}
		return SKIP_BODY;
	}
}

