package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			if (!theGeopoliticalEntity.commitNeeded) {
				pageContext.getOut().print(theGeopoliticalEntity.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			return theGeopoliticalEntity.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeopoliticalEntity for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			theGeopoliticalEntity.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hideFromDisplay tag ");
		}
	}
}

