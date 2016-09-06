package edu.uiowa.slis.VIVOISF.F1000Link;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class F1000LinkRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static F1000LinkRank currentInstance = null;
	private static final Log log = LogFactory.getLog(F1000LinkRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			F1000LinkRankIterator theF1000Link = (F1000LinkRankIterator)findAncestorWithClass(this, F1000LinkRankIterator.class);
			pageContext.getOut().print(theF1000Link.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing F1000Link for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for rank tag ");
		}
		return SKIP_BODY;
	}
}

