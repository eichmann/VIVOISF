package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			if (!theGeopoliticalEntity.commitNeeded) {
				pageContext.getOut().print(theGeopoliticalEntity.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			return theGeopoliticalEntity.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeopoliticalEntity for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			theGeopoliticalEntity.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for abbreviation tag ");
		}
	}
}

