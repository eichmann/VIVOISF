package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryRankIterator theExplanatory = (ExplanatoryRankIterator)findAncestorWithClass(this, ExplanatoryRankIterator.class);
			pageContext.getOut().print(theExplanatory.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for rank tag ");
		}
		return SKIP_BODY;
	}
}

