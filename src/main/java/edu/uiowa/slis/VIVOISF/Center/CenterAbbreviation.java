package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			if (!theCenter.commitNeeded) {
				pageContext.getOut().print(theCenter.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Center for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			return theCenter.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Center for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			theCenter.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Center for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for abbreviation tag ");
		}
	}
}

