package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupRank currentInstance = null;
	private static final Log log = LogFactory.getLog(groupRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupRankIterator thegroup = (groupRankIterator)findAncestorWithClass(this, groupRankIterator.class);
			pageContext.getOut().print(thegroup.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing group for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for rank tag ");
		}
		return SKIP_BODY;
	}
}

