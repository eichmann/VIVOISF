package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			if (!theContinent.commitNeeded) {
				pageContext.getOut().print(theContinent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			return theContinent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Continent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			theContinent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for label tag ");
		}
	}
}

