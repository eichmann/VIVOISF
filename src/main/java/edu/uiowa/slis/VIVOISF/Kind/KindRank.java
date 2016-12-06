package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindRank currentInstance = null;
	private static final Log log = LogFactory.getLog(KindRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindRankIterator theKind = (KindRankIterator)findAncestorWithClass(this, KindRankIterator.class);
			pageContext.getOut().print(theKind.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for rank tag ");
		}
		return SKIP_BODY;
	}
}

