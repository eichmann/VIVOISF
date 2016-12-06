package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneRank currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TelephoneRankIterator theTelephone = (TelephoneRankIterator)findAncestorWithClass(this, TelephoneRankIterator.class);
			pageContext.getOut().print(theTelephone.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for rank tag ");
		}
		return SKIP_BODY;
	}
}

