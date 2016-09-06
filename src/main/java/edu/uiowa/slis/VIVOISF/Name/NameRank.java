package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameRank currentInstance = null;
	private static final Log log = LogFactory.getLog(NameRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameRankIterator theName = (NameRankIterator)findAncestorWithClass(this, NameRankIterator.class);
			pageContext.getOut().print(theName.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for rank tag ");
		}
		return SKIP_BODY;
	}
}

