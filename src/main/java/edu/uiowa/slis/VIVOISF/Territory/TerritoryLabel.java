package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Territory theTerritory = (Territory)findAncestorWithClass(this, Territory.class);
			if (!theTerritory.commitNeeded) {
				pageContext.getOut().print(theTerritory.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Territory theTerritory = (Territory)findAncestorWithClass(this, Territory.class);
			return theTerritory.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Territory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Territory theTerritory = (Territory)findAncestorWithClass(this, Territory.class);
			theTerritory.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for label tag ");
		}
	}
}

