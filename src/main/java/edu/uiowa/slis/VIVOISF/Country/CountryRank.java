package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryRank currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryRankIterator theCountry = (CountryRankIterator)findAncestorWithClass(this, CountryRankIterator.class);
			pageContext.getOut().print(theCountry.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for rank tag ");
		}
		return SKIP_BODY;
	}
}

