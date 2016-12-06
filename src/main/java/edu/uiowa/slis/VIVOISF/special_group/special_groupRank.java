package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupRank currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupRankIterator thespecial_group = (special_groupRankIterator)findAncestorWithClass(this, special_groupRankIterator.class);
			pageContext.getOut().print(thespecial_group.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for rank tag ");
		}
		return SKIP_BODY;
	}
}

