package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			self_governing theself_governing = (self_governing)findAncestorWithClass(this, self_governing.class);
			if (!theself_governing.commitNeeded) {
				pageContext.getOut().print(theself_governing.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			self_governing theself_governing = (self_governing)findAncestorWithClass(this, self_governing.class);
			return theself_governing.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing self_governing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			self_governing theself_governing = (self_governing)findAncestorWithClass(this, self_governing.class);
			theself_governing.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for abbreviation tag ");
		}
	}
}

