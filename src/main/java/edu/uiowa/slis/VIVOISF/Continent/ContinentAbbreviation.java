package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			if (!theContinent.commitNeeded) {
				pageContext.getOut().print(theContinent.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			return theContinent.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Continent for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			theContinent.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for abbreviation tag ");
		}
	}
}

