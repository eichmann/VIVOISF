package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyRank currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyRankIterator theGovernmentAgency = (GovernmentAgencyRankIterator)findAncestorWithClass(this, GovernmentAgencyRankIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for rank tag ");
		}
		return SKIP_BODY;
	}
}

