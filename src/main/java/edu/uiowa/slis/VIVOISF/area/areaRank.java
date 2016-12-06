package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaRank currentInstance = null;
	private static final Log log = LogFactory.getLog(areaRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaRankIterator thearea = (areaRankIterator)findAncestorWithClass(this, areaRankIterator.class);
			pageContext.getOut().print(thearea.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing area for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for rank tag ");
		}
		return SKIP_BODY;
	}
}

