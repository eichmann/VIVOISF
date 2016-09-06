package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			if (!theMuseum.commitNeeded) {
				pageContext.getOut().print(theMuseum.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			return theMuseum.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Museum for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			theMuseum.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for abbreviation tag ");
		}
	}
}

