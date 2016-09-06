package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteDoiIterator theStatute = (StatuteDoiIterator)findAncestorWithClass(this, StatuteDoiIterator.class);
			pageContext.getOut().print(theStatute.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for doi tag ");
		}
		return SKIP_BODY;
	}
}

