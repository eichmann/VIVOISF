package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			if (!theContinent.commitNeeded) {
				pageContext.getOut().print(theContinent.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			return theContinent.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Continent for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			theContinent.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hideFromDisplay tag ");
		}
	}
}

