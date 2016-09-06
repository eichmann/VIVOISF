package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupRank currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupRankIterator theGroup = (GroupRankIterator)findAncestorWithClass(this, GroupRankIterator.class);
			pageContext.getOut().print(theGroup.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for rank tag ");
		}
		return SKIP_BODY;
	}
}

