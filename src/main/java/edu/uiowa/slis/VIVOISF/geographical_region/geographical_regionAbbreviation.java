package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			if (!thegeographical_region.commitNeeded) {
				pageContext.getOut().print(thegeographical_region.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			return thegeographical_region.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing geographical_region for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			thegeographical_region.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for abbreviation tag ");
		}
	}
}

